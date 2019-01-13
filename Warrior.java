package com.example.user.game;

public class Warrior extends HumanActivity.Human{
        /**
         **************** Tips ****************
         * Jobs: Hunter, Warrior, Mage
         * Weapons and Skills:
         * -----------------------------------
         * | Warrior |
         * | Default Blade | Slash |
         * | Fire Blade | Fire Slash |
         * | Ice Blade | Ice Slash |
         * -----------------------------------
         *
         */
        private String warrior ;
        public final static int DefaultBlade = 1 ;
        public final static int FireBlade = 2 ;
        public final static int IceBlade = 3 ;
        public warrior () {
        }
        public void attack () {
            System. out .println( "Fist Attack!" ) ;
        }
}
