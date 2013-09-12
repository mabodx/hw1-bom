
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

/** 
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * @generated */
public class AnswerTopN_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerTopN_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerTopN_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerTopN(addr, AnswerTopN_Type.this);
  			   AnswerTopN_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerTopN(addr, AnswerTopN_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerTopN.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.AnswerTopN");
 
  /** @generated */
  final Feature casFeat_baseAnnotation;
  /** @generated */
  final int     casFeatCode_baseAnnotation;
  /** @generated */ 
  public int getBaseAnnotation(int addr) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.AnswerTopN");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseAnnotation);
  }
  /** @generated */    
  public void setBaseAnnotation(int addr, int v) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.AnswerTopN");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseAnnotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elementAnswer;
  /** @generated */
  final int     casFeatCode_elementAnswer;
  /** @generated */ 
  public int getElementAnswer(int addr) {
        if (featOkTst && casFeat_elementAnswer == null)
      jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer);
  }
  /** @generated */    
  public void setElementAnswer(int addr, int v) {
        if (featOkTst && casFeat_elementAnswer == null)
      jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    ll_cas.ll_setRefValue(addr, casFeatCode_elementAnswer, v);}
    
   /** @generated */
  public int getElementAnswer(int addr, int i) {
        if (featOkTst && casFeat_elementAnswer == null)
      jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer), i);
  }
   
  /** @generated */ 
  public void setElementAnswer(int addr, int i, int v) {
        if (featOkTst && casFeat_elementAnswer == null)
      jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elementAnswer), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerTopN_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseAnnotation = jcas.getRequiredFeatureDE(casType, "baseAnnotation", "uima.BaseAnnotationType", featOkTst);
    casFeatCode_baseAnnotation  = (null == casFeat_baseAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseAnnotation).getCode();

 
    casFeat_elementAnswer = jcas.getRequiredFeatureDE(casType, "elementAnswer", "uima.cas.FSArray", featOkTst);
    casFeatCode_elementAnswer  = (null == casFeat_elementAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elementAnswer).getCode();

  }
}



    