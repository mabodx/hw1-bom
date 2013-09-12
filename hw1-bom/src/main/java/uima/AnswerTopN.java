

/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * XML source: /Users/mabodx/code/java/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class AnswerTopN extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerTopN.class);
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
  protected AnswerTopN() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerTopN(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerTopN(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerTopN(JCas jcas, int begin, int end) {
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
  //* Feature: baseAnnotation

  /** getter for baseAnnotation - gets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated.
   * @generated */
  public BaseAnnotationType getBaseAnnotation() {
    if (AnswerTopN_Type.featOkTst && ((AnswerTopN_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.AnswerTopN");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_baseAnnotation)));}
    
  /** setter for baseAnnotation - sets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated. 
   * @generated */
  public void setBaseAnnotation(BaseAnnotationType v) {
    if (AnswerTopN_Type.featOkTst && ((AnswerTopN_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.AnswerTopN");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_baseAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: elementAnswer

  /** getter for elementAnswer - gets the Array contain the answer score and AnswerScore type contain the Answer sentence information, so we can get the answer and answer score through this array.
   * @generated */
  public FSArray getElementAnswer() {
    if (AnswerTopN_Type.featOkTst && ((AnswerTopN_Type)jcasType).casFeat_elementAnswer == null)
      jcasType.jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_elementAnswer)));}
    
  /** setter for elementAnswer - sets the Array contain the answer score and AnswerScore type contain the Answer sentence information, so we can get the answer and answer score through this array. 
   * @generated */
  public void setElementAnswer(FSArray v) {
    if (AnswerTopN_Type.featOkTst && ((AnswerTopN_Type)jcasType).casFeat_elementAnswer == null)
      jcasType.jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_elementAnswer, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elementAnswer - gets an indexed value - the Array contain the answer score and AnswerScore type contain the Answer sentence information, so we can get the answer and answer score through this array.
   * @generated */
  public AnswerScore getElementAnswer(int i) {
    if (AnswerTopN_Type.featOkTst && ((AnswerTopN_Type)jcasType).casFeat_elementAnswer == null)
      jcasType.jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_elementAnswer), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_elementAnswer), i)));}

  /** indexed setter for elementAnswer - sets an indexed value - the Array contain the answer score and AnswerScore type contain the Answer sentence information, so we can get the answer and answer score through this array.
   * @generated */
  public void setElementAnswer(int i, AnswerScore v) { 
    if (AnswerTopN_Type.featOkTst && ((AnswerTopN_Type)jcasType).casFeat_elementAnswer == null)
      jcasType.jcas.throwFeatMissing("elementAnswer", "uima.AnswerTopN");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_elementAnswer), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTopN_Type)jcasType).casFeatCode_elementAnswer), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    