public class TimeCalc {
    public static void main(String[] args) {
        String[] timeParts = args[0].split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int minutesToAdd = Integer.parseInt(args[1]);
        // System.out.println("hours: " + hours);
        // System.out.println("minutes: " + minutes);
        // System.out.println("minutes to add: " + minutesToAdd);
        int totalmins = (hours * 60) + minutes + minutesToAdd;
        int totalhours = totalmins / 60;
        int newhours = totalhours % 24;
        int newminutes = totalmins - (totalhours*60);
        if (newhours >= 10 && newminutes >= 10) {
            System.out.println(newhours + ":" + newminutes);
        } else if (newhours >= 10 && newminutes < 10){
            System.out.println(newhours + ":0" + newminutes);
        }else if(newminutes>=10){
            System.out.println("0" + newhours +":" + newminutes);
        }else{ 
            System.out.println("0"+newhours + ":0" + newminutes);
        }
        
    }
}