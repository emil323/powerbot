package org.powerbot;

import org.powerbot.game.bot.Bot;

import javax.swing.*;
import java.awt.*;

public class Test {
	public static void main(String[] params) {
		Bot bot = new Bot();
		if (bot.initializeEnvironment()) {
			bot.startEnvironment();

			JFrame frame = new JFrame();
			frame.add(bot.appletContainer);
			frame.setSize(new Dimension(Chrome.PANEL_WIDTH, Chrome.PANEL_HEIGHT));
			frame.setLocationRelativeTo(frame.getParent());
			frame.setVisible(true);
		}
	}
}
