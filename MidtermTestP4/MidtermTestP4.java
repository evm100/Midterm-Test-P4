public class MidtermTestP4 {



    public static void main(String[]args) {
        IO io = new IO();
        DataTypes dt = new DataTypes();
        ControlFlow cf = new ControlFlow();
        RandomLogic rl = new RandomLogic();
        LogoDesign ld = new LogoDesign();

        io.askQuestion(); //working :)
        dt.askQuestion();
        cf.askQuestion();
        rl.askQuestion();
        ld.displayLogo();

    }
}