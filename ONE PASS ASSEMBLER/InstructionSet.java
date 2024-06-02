import java.util.HashMap;
public class InstructionSet {
    static HashMap<String,String> i = new HashMap<>();
    public static HashMap<String, String> getI() {
        i.put("18","ADD");
        i.put("40","AND");
        i.put("28","COMP");
        i.put("24","DIV");
        i.put("3C","J");
        i.put("30","JEQ");
        i.put("34","JGT");
        i.put("38","JLT");
        i.put("48","JSUB");
        i.put("00","LDA");
        i.put("50","LDCH");
        i.put("08","LDL");
        i.put("04","LDX");
        i.put("20","MUL");
        i.put("44","OR");
        i.put("D8","RD");
        i.put("4C","RSUB");
        i.put("0C","STA");
        i.put("54","STCH");
        i.put("14","STL");
        i.put("E8","STSW");
        i.put("10","STX");
        i.put("1C","SUB");
        i.put("E0","TD");
        i.put("2C","TIX");
        i.put("DC","WD");
        i.put("C4","FIX");
        i.put("C0","FLOAT");
        i.put("F4","HIO");
        i.put("C8","NORM");
        i.put("F0","SIO");
        i.put("F8","TIO");
        return i;
    }
    static public String getKey(String val){
        String c="didnt enter yet";
        if(i.containsValue(val)){
            for(String x:i.keySet()){
                if(i.get(x).equals(val))
                    c = x;
            }
        }
        else{
            c="not found";   
        }   
        return c;
    }
    static public boolean containsInst(String Inst){
        return i.containsValue(Inst);
    }
}