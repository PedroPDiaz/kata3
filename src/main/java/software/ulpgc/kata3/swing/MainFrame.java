package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.HistogramDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private HistogramDisplay histogramDisplay;

    public HistogramDisplay histogramDisplay() {
        return histogramDisplay;
    }

    public MainFrame() throws HeadlessException {
        setTitle("Histogram");
        setSize(1200, 1200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreeHistogramDisplay display = new JFreeHistogramDisplay();
        histogramDisplay = display;
        return display;
    }
}
