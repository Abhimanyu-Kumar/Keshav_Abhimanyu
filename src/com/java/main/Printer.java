package com.java.main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class Printer implements Printable {
	final Component comp;

	public Printer(Component comp) {
		this.comp = comp;
	}

	@Override
	public int print(Graphics g, PageFormat format, int page_index) throws PrinterException {
		if (page_index > 0) {
			return Printable.NO_SUCH_PAGE;
		}

		// get the bounds of the component
		Dimension dim = comp.getSize();
		double cHeight = dim.getHeight();
		double cWidth = dim.getWidth();

		// get the bounds of the printable area
		double pHeight = format.getImageableHeight();
		double pWidth = format.getImageableWidth();

		double pXStart = format.getImageableX();
		double pYStart = format.getImageableY();

		double xRatio = pWidth / cWidth;
		double yRatio = pHeight / cHeight;

		Graphics2D g2 = (Graphics2D) g;
		g2.translate(pXStart, pYStart);
		g2.scale(xRatio, yRatio);
		comp.paint(g2);

		return Printable.PAGE_EXISTS;
	}

	public static BufferedImage getScreenShot(Component component) {

		BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(),
				BufferedImage.TYPE_INT_RGB);
		// call the Component's paint method, using
		// the Graphics object of the image.
		component.paint(image.getGraphics()); // alternately use .printAll(..)
		return image;
	}
	
	public static void convertJPGToPDF(String strimg, BufferedImage bufferedImage) {
		try {
			// create document object
			Document doc = new Document();
			// create pdf writer object to write the document to the output file
			PdfWriter.getInstance(doc, new FileOutputStream(strimg));
			// get a4 paper size
			Rectangle r = PageSize.A4;
			// read the image
			BufferedImage orImg = bufferedImage;
			// initialize image width and height
			int width = orImg.getWidth();
			int height = orImg.getHeight();
			// resize the image that is bigger than A4 size
			if (width > r.getWidth())
				width = (int) r.getWidth();
			if (height > r.getHeight())
				height = (int) r.getHeight();
			// create a blank buffered image
			BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			// create graphic2d object from the buffered image
			Graphics2D g2d = bi.createGraphics();
			// draw the original image on the buffered image
			// so the image is resized to fit the A4 paper size if it is bigger
			// than A4 size
			g2d.drawImage(orImg, 0, 0, width, height, null);
			// store the image data in memory
			ByteArrayOutputStream bas = new ByteArrayOutputStream();
			ImageIO.write(bi, "tiff", bas);
			// create image from the image data stored in memory
			Image img = Image.getInstance(bas.toByteArray());
			// centrally align the image on the pdf page
			img.setAlignment(Element.ALIGN_CENTER);
			// open document
			doc.open();
			// add image to the document
			doc.add(img);
			// close the document
			doc.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
