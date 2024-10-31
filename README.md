# Machine Learning Integration with Rule Engine "Drools". Automatic Rule Creating from Decision Trees

## Overview
View **"DT_To_Drools_Parser.ipynb"** for a demo on how to use the parser and integrate it into your Drools Engine
## Project Structure
- **Dataset Creation**: Custom PyTorch `Dataset` class with data split into training, validation, and test sets.
- **Model Training**: XGBoost classifier model setup, training, and evaluation.
- **Feature Analysis**: Use SHAP (SHapley Additive exPlanations) values for feature importance analysis.
- **Rule Extraction and Distillation**: Extract rules from a Decision Tree distillation of the XGBoost model and convert them into Drools-compatible rules.
- **Java and Drools Integration**: Use Java and Drools to evaluate rules with the dataset, validating classification performance in a rule-based setup.

## Contents

1. **Dataset Preparation**
   - `createCustomDataset`: PyTorch dataset class for easy feature and label management.
   - Data split into training (70%), validation (15%), and testing (15%) subsets.
   - Data loaders created for efficient batch processing.

2. **Model Training with XGBoost**
   - Training of XGBoost classifier on training data with custom parameters.
   - Model evaluation using validation and test sets for accuracy assessment.

3. **Feature Importance Analysis**
   - SHAP (SHapley Additive exPlanations) values computed to assess feature importance.
   - Summary plots generated to visually interpret feature contributions.

4. **Model Distillation and Rule Extraction**
   - Distillation of the trained XGBoost model into a simpler Decision Tree model.
   - Extraction of rules from the Decision Tree in a format compatible with Drools.

5. **Drools Rule Conversion**
   - Automatic conversion of Decision Tree rules into Drools `.drl` files.
   - Java setup for integrating and testing Drools rules with Fact classes in a rule-based setup.

6. **Java and Drools Execution**
   - Creation of a `FactClass.java` file with fields corresponding to dataset features.
   - Execution of Drools rules through `MyDroolsApp.java`, validating rule accuracy against test data.

## Usage Instructions

1. **Setup Environment**
   - Ensure all Python libraries are installed (e.g., `torch`, `xgboost`, `shap`).
   - Install Java 11 and Drools dependencies for Drools rule evaluation.

2. **Run the Dataset and Model Training Script**
   - Run the provided dataset and model training code to generate training, validation, and test splits, train the XGBoost model, and perform SHAP analysis.

3. **Convert Rules to Drools**
   - Execute the rule extraction and conversion script to save `.drl` rule files compatible with Drools.

4. **Run Java Code for Rule Evaluation**
   - Compile and run `MyDroolsApp.java` to load test data, apply rules, and output classification accuracy.

## Requirements

### Python
- `torch`
- `numpy`
- `xgboost`
- `shap`
- `sklearn`
  
### Java
- OpenJDK 11
- Drools distribution (8.44.0 or compatible)

## Results
- **Model Accuracy**: Evaluation of the XGBoost classifier and distilled Decision Tree model, followed by the accuracy of rule-based classification with Drools.
- **Feature Importance**: SHAP values indicate the most critical features for classification.
- **Drools Rule Performance**: Accurate translation of model logic to Drools rules for real-time, rule-based decision-making.

## Additional Notes
- Modify the Java and Drools paths as necessary based on the local setup.
- Ensure Drools `.drl` files and CSV data files are correctly placed for rule execution in Java.

## Contributing
Contributions for enhancing the automation of rule extraction and improving compatibility across different environments are welcome.

## License
This project is licensed under the MIT License.

For detailed instructions on each step, refer to the script comments and usage explanations provided in this README.
