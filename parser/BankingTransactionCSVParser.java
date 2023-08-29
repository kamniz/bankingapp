package pl.globallogic.bankingapp.parser;


    public class BankingTransactionCSVParser{

        public static List<BankingTransaction> parseFile(Path file) throws IOException {
            //read file
            List<String> rawTransactions = Files.readAllLines(file);
            //create list of transaction
            //return list
        }

    }

