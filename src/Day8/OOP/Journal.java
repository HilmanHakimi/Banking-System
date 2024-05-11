package Day8.OOP;

 class Journal extends LibraryItem{

        private final String category;
        private final String issueDate;
        private final String issn;

        public Journal(String name, String category, String issueDate, String issn){
            super(name);
            this.category = category;
            this.issueDate = issueDate;
            this.issn = issn;
        }
        @Override
        public String getDetails(){
            return "Journal Name : "+ getName()+"\nCategory: " +category+"\nIssue Date: "+ issueDate+"\nISNN"+issn+"\nIs Available: "+((isAvailable()?"Yes":"No"));
        }
    }

