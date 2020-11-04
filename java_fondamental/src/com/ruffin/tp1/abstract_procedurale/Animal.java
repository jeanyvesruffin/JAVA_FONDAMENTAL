package com.ruffin.tp1.abstract_procedurale;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class Animal {

	public void draw(final GraphicsContext gc) {
		// tete
		drawHead(gc);
		// oreilles
		drawEars(gc);
		// yeux
		drawEyes(gc);
		// Nez
		drawNose(gc);
		// Bouche
		drawMouth(gc);
	}

	private void drawMouth(GraphicsContext gc) {
		gc.strokeLine(350, 475, 350, 550);
		gc.strokeArc(280, 450, 140, 100, 180, 180, ArcType.OPEN);
	}

	private void drawNose(final GraphicsContext gc) {
		gc.fillOval(320, 400, 60, 60);

	}

	private void drawEyes(GraphicsContext gc) {
		gc.fillOval(250, 320, 30, 30);
		gc.fillOval(450, 320, 30, 30);
	}

	private void drawEars(final GraphicsContext gc) {
		gc.strokeOval(85, 85, 100, 100);
		gc.strokeOval(515, 85, 100, 100);
	}

	private void drawHead(final GraphicsContext gc) {
		gc.setLineWidth(5);
		gc.strokeOval(100, 100, 500, 500);
		gc.strokeOval(225, 350, 250, 250);
	}

}
