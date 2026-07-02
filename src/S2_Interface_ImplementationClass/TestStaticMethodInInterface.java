package S2_Interface_ImplementationClass;
public class TestStaticMethodInInterface
{
    public static void main(String[] args)
    {
        CommonFunctionsClass.captureSS();   //className.methodName()
        CommonFunctionsClass.captureSS();
        CommonFunctionsClass.captureSS();

        CommonFunctions.captureSS();     //InterfaceName.methodName()
        CommonFunctions.getDataFromExcel();
        CommonFunctions.writeDataInExcel();

//        CommonFunctions.getExcelPath()   //no access
            }
}
