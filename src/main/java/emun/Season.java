package emun;

public enum Season {
        WINTER(1), SPRING(2), SUMMER(3), AUTUM(4);// bez konstruktora mam bład komplikacji, musimy stwprzyć konstruktor
        //Enum może mieć meotdy, konstruktor
        private  int value;
        Season(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
// Enum w javie to DaysOfWeek, Months
