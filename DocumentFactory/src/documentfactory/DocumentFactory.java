/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentfactory;
/**
 *
 * @author Nandita
 */
public class DocumentFactory
{
        public static DocumentInterface getDocumentInterface(int doctype)
        {
            if(doctype==1)
            {
                return new Documentword();
            }
            else if(doctype==2)
            {
                return new Documentnotepad();
            }
            else if(doctype==3)
            {
                return new DocumentPDF();
            }
            else if(doctype==4)
            {
                return new Documentexcel();
            }
            else
            {
                return null;
            }
        }
}
