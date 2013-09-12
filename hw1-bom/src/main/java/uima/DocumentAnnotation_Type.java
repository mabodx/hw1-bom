
/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This kind of type is to show a instance of document. It stores the token information so it get a token feature.
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * @generated */
public class DocumentAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DocumentAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DocumentAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DocumentAnnotation(addr, DocumentAnnotation_Type.this);
  			   DocumentAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DocumentAnnotation(addr, DocumentAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.DocumentAnnotation");
 
  /** @generated */
  final Feature casFeat_baseAnnotation;
  /** @generated */
  final int     casFeatCode_baseAnnotation;
  /** @generated */ 
  public int getBaseAnnotation(int addr) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.DocumentAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseAnnotation);
  }
  /** @generated */    
  public void setBaseAnnotation(int addr, int v) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.DocumentAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseAnnotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_element;
  /** @generated */
  final int     casFeatCode_element;
  /** @generated */ 
  public int getElement(int addr) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "uima.DocumentAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_element);
  }
  /** @generated */    
  public void setElement(int addr, int v) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "uima.DocumentAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_element, v);}
    
   /** @generated */
  public int getElement(int addr, int i) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "uima.DocumentAnnotation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_element), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i);
  }
   
  /** @generated */ 
  public void setElement(int addr, int i, int v) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "uima.DocumentAnnotation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_element), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DocumentAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseAnnotation = jcas.getRequiredFeatureDE(casType, "baseAnnotation", "uima.BaseAnnotationType", featOkTst);
    casFeatCode_baseAnnotation  = (null == casFeat_baseAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseAnnotation).getCode();

 
    casFeat_element = jcas.getRequiredFeatureDE(casType, "element", "uima.cas.FSArray", featOkTst);
    casFeatCode_element  = (null == casFeat_element) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_element).getCode();

  }
}



    