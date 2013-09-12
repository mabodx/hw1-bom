

/* First created by JCasGen Thu Sep 12 01:39:59 EDT 2013 */
package uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This kind of type is to evaluate the precision of the results
 * Updated by JCasGen Thu Sep 12 01:40:01 EDT 2013
 * XML source: /Users/mabodx/code/java/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class Evaluation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
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
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
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
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Evaluation");
    return (BaseAnnotationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_baseAnnotation)));}
    
  /** setter for baseAnnotation - sets This kind of feature is to inherited from the BaseAnnotation to get the feature of casProcessorId and confidence, so we can get the annotation where it is generated. 
   * @generated */
  public void setBaseAnnotation(BaseAnnotationType v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_baseAnnotation == null)
      jcasType.jcas.throwFeatMissing("baseAnnotation", "uima.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_baseAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: precistionN

  /** getter for precistionN - gets The number of correct answer N.
   * @generated */
  public int getPrecistionN() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precistionN == null)
      jcasType.jcas.throwFeatMissing("precistionN", "uima.Evaluation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precistionN);}
    
  /** setter for precistionN - sets The number of correct answer N. 
   * @generated */
  public void setPrecistionN(int v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precistionN == null)
      jcasType.jcas.throwFeatMissing("precistionN", "uima.Evaluation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precistionN, v);}    
   
    
  //*--------------*
  //* Feature: precisionScore

  /** getter for precisionScore - gets the result of measuring performance by Precision@N (how many of the top N are correct).
   * @generated */
  public double getPrecisionScore() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionScore == null)
      jcasType.jcas.throwFeatMissing("precisionScore", "uima.Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionScore);}
    
  /** setter for precisionScore - sets the result of measuring performance by Precision@N (how many of the top N are correct). 
   * @generated */
  public void setPrecisionScore(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precisionScore == null)
      jcasType.jcas.throwFeatMissing("precisionScore", "uima.Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precisionScore, v);}    
  }

    