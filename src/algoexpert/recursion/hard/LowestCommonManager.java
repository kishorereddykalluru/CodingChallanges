package algoexpert.recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonManager {

    //O(n) time | O(d) space - where n is the number of people
    //in the org and d is the depth (height) of the org chart
    public static OrgChart getLowestCommonManager(OrgChart topManager, OrgChart reportOne, OrgChart reportTwo) {
        return getOrgInfo(topManager, reportOne, reportTwo).lowestCommonManager;
    }

    public static OrgInfo getOrgInfo(OrgChart manager, OrgChart reportOne, OrgChart reporttwo) {
        int numImportantReports = 0;
        for(OrgChart directReport: manager.directReports) {
            OrgInfo orgInfo = getOrgInfo(directReport, reportOne, reporttwo);
            if(orgInfo.lowestCommonManager != null) return orgInfo;
            numImportantReports += orgInfo.numImportantReports;
        }
        if(manager == reportOne || manager ==reporttwo) numImportantReports++;
        OrgChart lowestCommonManager = numImportantReports == 2 ? manager : null;
        OrgInfo newOrgInfo = new OrgInfo(lowestCommonManager, numImportantReports);
        return newOrgInfo;
    }

    static class OrgChart {
        public char name;
        public List<OrgChart> directReports;

        OrgChart(char name) {
            this.name = name;
            this.directReports = new ArrayList<>();
        }
        public void addDirectReports(OrgChart[] directReports) {
            for(OrgChart directReport: directReports) {
                this.directReports.add(directReport);
            }
        }
    }

    static class OrgInfo {
        public OrgChart lowestCommonManager;
        int numImportantReports;

        OrgInfo(OrgChart lowestCommonManager, int numImportantReports) {
            this.lowestCommonManager = lowestCommonManager;
            this.numImportantReports = numImportantReports;
        }
    }

    public static void main(String[] args) {


    }
}
