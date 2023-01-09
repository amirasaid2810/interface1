package com.example.interface1;

   public class SellsTableClass {
    private Integer idcolumn;
    private String REFcolumn;
    private  String DATEcolumn;
    private String QTEcolumn;
    private String Pricecolumn ;

      public SellsTableClass (Integer idcolumn, String REFcolumn , String DATEcolumn , String QTEcolumn, String Pricecolumn){

         this.idcolumn=idcolumn;
         this.REFcolumn=REFcolumn;
         this.DATEcolumn=DATEcolumn;
         this.QTEcolumn=QTEcolumn;
         this.Pricecolumn=Pricecolumn;

                    }
      public Integer getId(){
          return idcolumn;
    }
      public String getREF(){
          return REFcolumn;
    }

      public String getDate() {
           return DATEcolumn;
       }
       public String getQuantity(){
          return QTEcolumn;
       }
       public String getPrice(){
          return Pricecolumn;
       }

   }
