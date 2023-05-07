package People;

import ClubInfo.Club;

/** Клас Guard імітує охоронця на вході в клуб. Щоб зайти в клуб, потрібно пройти перевірку по таких умовах як:
    клуб не повністю заповнений людьми, відвідувач старше повнолітній та перевірка чи гість має VIP статус.
    Якщо гість не VIP, то за вхід знімається 200 грн.
*/
public class Guard{
    boolean checkPassed;
    public void work(Visitor visitor, Club club){
        if(club.actualNumOfVisitors < club.maxNumOfVisitors){
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
        } else {
            System.out.println("Клуб переповнений. Приходьте пізніше.");
        }
    }

    public boolean isCheckPassed() {
        return checkPassed;
    }

    public void setCheckPassed(boolean checkPassed) {
        this.checkPassed = checkPassed;
    }
}