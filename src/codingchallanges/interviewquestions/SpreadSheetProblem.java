package codingchallanges.interviewquestions;

public class SpreadSheetProblem {

    public static void main(String[] args) {
            System.out.println(ExcelColumnName(2106));

    }
    private static  String ExcelColumnName(int colNum) {
        int Base = 26;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String colName = "";
        int rowNum = 1;

        if(colNum == 0 )
            return "";

        while(colNum > 702){
            colNum = colNum % 702 ;
            rowNum++;
        }

        while (colNum > 0) {
            int position = colNum % Base;
            colName = (position == 0 ? 'Z' : chars.charAt(position > 0 ? position - 1 : 0)) + colName;
            colNum = (colNum - 1) / Base;
        }

        if("".equals(colName)){
            colName = "ZZ";
        }
        return rowNum+colName;
    }
}
