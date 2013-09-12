
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

/** This kind of type is annotating the question in document so that we can get the answer from the document
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * @generated */
public class Question_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.Question");
 
  /** @generated */
  final Feature casFeat_baseAnnotation;
  /** @generated */
  final int     casFeatCode_baseAnnotation;
  /** @generated */ 
  public int getBaseAnnotation(int addr) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_baseAnnotation);
  }
  /** @generated */    
  public void setBaseAnnotation(int addr, int v) {
        if (featOkTst && casFeat_baseAnnotation == null)
      jcas.throwFeatMissing("baseAnnotation", "uima.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_baseAnnotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_baseAnnotation = jcas.getRequiredFeatureDE(casType, "baseAnnotation", "uima.BaseAnnotationType", featOkTst);
    casFeatCode_baseAnnotation  = (null == casFeat_baseAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_baseAnnotation).getCode();

  }
}



    