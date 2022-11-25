public class Server {
        protected String name;
        protected boolean available;

        public Server(String name, boolean available) {
            this.name = name;
            this.available = available;
        }

        public void changeAvailablity(boolean status)
        {
            available = status;
        }
       
        public boolean isavailable()
        {
           return available;
        }
       
}
