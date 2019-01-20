package com.example.user.game;

public class Hunter extends HumanActivity.Human {
    /**
     **************** Tips ****************
     * Jobs: Hunter, Warrior, Mage
     * Weapons and Skills:
     * -----------------------------------
     * | Hunter |
     * | Default Bow | Arrow |
     * | Fire Bow | Fire Arrow |
     * | Ice Bow | Ice Arrow |
     * -----------------------------------
     *
     */
    private String hunter ;
    public final static int defaultBow = 1 ;
    public final static int fireBow = 2 ;
    public final static int iceBow = 3 ;
    public hunter () {
        System.out.println("Defeat Enemy");
    }
    public hunter (Int num){
        num = 5;
        return;
    }
    public void attack () {
        System. out .println( "Fist Attack!" ) ;
    }
}
