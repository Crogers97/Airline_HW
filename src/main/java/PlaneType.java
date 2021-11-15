public enum PlaneType {

        B737("737", 100),
        B747("747", 101),
        B767("767", 102);


        private final String model;
        private final int seats;


        PlaneType(String model, int seats) {
            this.model = model;
            this.seats = seats;
        }

        public String getModelType() {
            return this.model;
        }

        public int getNumberOfSeats() {
            return this.seats;
        }
}
