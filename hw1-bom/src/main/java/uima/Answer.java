

/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This kind of type is to show a instance of one answer. Also, it answer whether this kind of answer is correct answer or just a wrong answer.
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * XML source: /Users/mabodx/code/java/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets We can know whether this answer is a correct answer or a wrong answer.
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "uima.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets We can know whether this answer is a correct answer or a wrong answer. 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "uima.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: baseAnnotation

  /** getter for baseAnnotation - gets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated.
   * @generated */
  public BaseAnnotationType getBaseAnnotation() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Answer");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_baseAnnotation)));}
    
  /** setter for baseAnnotation - sets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated. 
   * @generated */
  public void setBaseAnnotation(BaseAnnotationType v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_baseAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    