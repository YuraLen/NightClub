package People;

import ClubInfo.Club;

public class Guard{
    boolean checkPassed;
    public void work(Visitor visitor, Club club){
        // первірка на те чи клуб ще відкритий по графіку
        if (visitor.getAge() >= 18 ){
            if (visitor.isVIPClient()) {
                setCheckPassed(true);
                System.out.println("Охорона:  Ви пройшли фейсконтроль!");
            } else {
                if (visitor.getAmountOfMoney() > club.getPriceToEntry()){
                    visitor.setAmountOfMoney(visitor.getAmountOfMoney()-200);
                    setCheckPassed(true);
                    System.out.println("Списано 200грн за вхід!");
                    System.out.println("Охорона:  Ви пройшли фейсконтроль!");
                } else {
                    setCheckPassed(false);
                    System.out.println("Ви не можете пройти! Недостатньо коштів!");
                    System.out.println("Охорона:  Приходьте іншим разом.");
                }
            }
        } else {
            setCheckPassed(false);
            System.out.println("Охорона:  Ви не можете пройти! Вам немає 18 років!");
        }
    }

    public boolean isCheckPassed() {
        return checkPassed;
    }

    public void setCheckPassed(boolean checkPassed) {
        this.checkPassed = checkPassed;
    }
}
