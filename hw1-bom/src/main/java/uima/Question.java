

/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This kind of type is annotating the question in document so that we can get the answer from the document
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * XML source: /Users/mabodx/code/java/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Question");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_baseAnnotation)));}
    
  /** setter for baseAnnotation - sets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated. 
   * @generated */
  public void setBaseAnnotation(BaseAnnotationType v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_baseAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    