package software.ulpgc.kata3.swing;

import software.ulpgc.kata2.Organization;
import software.ulpgc.kata2.OrganizationLoader;
import software.ulpgc.kata2.TsvFileOrganizationLoader;
import software.ulpgc.kata3.Histogram;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrganizationLoader loader = new TsvFileOrganizationLoader(new File("dataset.tsv"));
        List<Organization> organizations = loader.load();
        double[] histogramValues = organizations.stream()
                .mapToDouble(Organization::getEmployees)
                .toArray();

        Histogram histogram = new Histogram(1000, histogramValues);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
