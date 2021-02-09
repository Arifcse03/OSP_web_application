package mnj.mfg.model.services.client;

import mnj.mfg.model.services.common.MainAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 21 13:15:07 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MainAMClient extends ApplicationModuleImpl implements MainAM {
    /**
     * This is the default constructor (do not remove).
     */
    public MainAMClient() {
    }


    public void setSTNWhereClause() {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSTNWhereClause",null,null);
        return;
    }

    public void popSTN() {
        Object _ret = this.riInvokeExportedMethod(this,"popSTN",null,null);
        return;
    }

    public void SplitFunctionality(String SplitQuantity) {
        Object _ret =
            this.riInvokeExportedMethod(this,"SplitFunctionality",new String [] {"java.lang.String"},new Object[] {SplitQuantity});
        return;
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respAppl) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSessionValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {orgId, userId, respId, respAppl});
        return;
    }

    public String MiscReceiptCreation() {
        Object _ret =
            this.riInvokeExportedMethod(this,"MiscReceiptCreation",null,null);
        return (String)_ret;
    }

    public String JobCreation() {
        Object _ret = this.riInvokeExportedMethod(this,"JobCreation",null,null);
        return (String)_ret;
    }

    public String ItemCreation() {
        Object _ret = this.riInvokeExportedMethod(this,"ItemCreation",null,null);
        return (String)_ret;
    }

    public String BpoCreation() {
        Object _ret = this.riInvokeExportedMethod(this,"BpoCreation",null,null);
        return (String)_ret;
    }

    public String AssignOperation() {
        Object _ret =
            this.riInvokeExportedMethod(this,"AssignOperation",null,null);
        return (String)_ret;
    }

    public String AddMaterial() {
        Object _ret = this.riInvokeExportedMethod(this,"AddMaterial",null,null);
        return (String)_ret;
    }

    public void selectAllStn(String flag) {
        Object _ret =
            this.riInvokeExportedMethod(this,"selectAllStn",new String [] {"java.lang.String"},new Object[] {flag});
        return;
    }

    public void OrgAssignToStns() {
        Object _ret =
            this.riInvokeExportedMethod(this,"OrgAssignToStns",null,null);
        return;
    }

    public String AssignSubInventories() {
        Object _ret =
            this.riInvokeExportedMethod(this,"AssignSubInventories",null,null);
        return (String)_ret;
    }

    public void DeptAssignToStns() {
        Object _ret =
            this.riInvokeExportedMethod(this,"DeptAssignToStns",null,null);
        return;
    }

    public void selectAllAssignOrg(String flag) {
        Object _ret =
            this.riInvokeExportedMethod(this,"selectAllAssignOrg",new String [] {"java.lang.String"},new Object[] {flag});
        return;
    }

    public void OrgAssignToPrinting() {
        Object _ret =
            this.riInvokeExportedMethod(this,"OrgAssignToPrinting",null,null);
        return;
    }

    public void OrgAssignToEmbriodery() {
        Object _ret =
            this.riInvokeExportedMethod(this,"OrgAssignToEmbriodery",null,null);
        return;
    }

    public void OrgAssignToPrintEmbriodery() {
        Object _ret =
            this.riInvokeExportedMethod(this,"OrgAssignToPrintEmbriodery",null,null);
        return;
    }
}
