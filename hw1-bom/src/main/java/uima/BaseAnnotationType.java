

/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This kind of type is a base type in the system. It inherits from the uima.tcas.Annotation type. The other two features this type has are casProcessorId and confidence. The other type will be the sub class of this one.
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * XML source: /Users/mabodx/code/java/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class BaseAnnotationType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotationType.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BaseAnnotationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotationType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets this is a string that we can get where the annotator is produced and provide information for annotator.
   * @generated */
  public String getCasProcessorId() {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "uima.BaseAnnotationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets this is a string that we can get where the annotator is produced and provide information for annotator. 
   * @generated */
  public void setCasProcessorId(String v) {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "uima.BaseAnnotationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Each annotation need a confidence score, so this will provide confidence score for each annotation.
   * @generated */
  public double getConfidence() {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "uima.BaseAnnotationType");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Each annotation need a confidence score, so this will provide confidence score for each annotation. 
   * @generated */
  public void setConfidence(double v) {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "uima.BaseAnnotationType");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: annotation

  /** getter for annotation - gets this is a base annotation that we can get the begin and end feature, so we can store the begin and end character of each sentence.
   * @generated */
  public Annotation getAnnotation() {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "uima.BaseAnnotationType");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_annotation)));}
    
  /** setter for annotation - sets this is a base annotation that we can get the begin and end feature, so we can store the begin and end character of each sentence. 
   * @generated */
  public void setAnnotation(Annotation v) {
    if (BaseAnnotationType_Type.featOkTst && ((BaseAnnotationType_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "uima.BaseAnnotationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((BaseAnnotationType_Type)jcasType).casFeatCode_annotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    