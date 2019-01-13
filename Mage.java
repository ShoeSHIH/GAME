package com.example.user.game;

public class Mage extends HumanActivity.Human{
        /**
         **************** Tips ****************
         * Jobs: Hunter, Warrior, Mage
         * Weapons and Skills:
         * -----------------------------------
         * | Mage |
         * | Default Staff | Arcane Missiles |
         * | Fire Staff | Fireball |
         * | Ice Staff | Frostbolt |
         * -----------------------------------
         *
         */
        private String mage ;
        public final static int DefaultStaff = 1 ;
        public final static int FireStaff = 2 ;
        public final static int IceStaff = 3 ;
        public mage () {
        }
        public void attack () {
            System. out .println( "Fist Attack!" ) ;
        }
}
