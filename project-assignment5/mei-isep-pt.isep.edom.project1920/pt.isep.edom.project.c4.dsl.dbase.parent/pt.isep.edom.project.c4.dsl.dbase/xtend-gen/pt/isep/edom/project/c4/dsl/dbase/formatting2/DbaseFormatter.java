/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c4.dsl.dbase.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess;
import pt.isep.edom.project.c4.mm.dbase.Column;
import pt.isep.edom.project.c4.mm.dbase.Constraint;
import pt.isep.edom.project.c4.mm.dbase.DbaseModel;
import pt.isep.edom.project.c4.mm.dbase.Table;

@SuppressWarnings("all")
public class DbaseFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private DbaseGrammarAccess _dbaseGrammarAccess;
  
  protected void _format(final DbaseModel dbaseModel, @Extension final IFormattableDocument document) {
    EList<Table> _tables = dbaseModel.getTables();
    for (final Table table : _tables) {
      document.<Table>format(table);
    }
  }
  
  protected void _format(final Table table, @Extension final IFormattableDocument document) {
    EList<Column> _columns = table.getColumns();
    for (final Column column : _columns) {
      document.<Column>format(column);
    }
    EList<Constraint> _constraint = table.getConstraint();
    for (final Constraint constraint : _constraint) {
      document.<Constraint>format(constraint);
    }
  }
  
  public void format(final Object dbaseModel, final IFormattableDocument document) {
    if (dbaseModel instanceof XtextResource) {
      _format((XtextResource)dbaseModel, document);
      return;
    } else if (dbaseModel instanceof DbaseModel) {
      _format((DbaseModel)dbaseModel, document);
      return;
    } else if (dbaseModel instanceof Table) {
      _format((Table)dbaseModel, document);
      return;
    } else if (dbaseModel instanceof EObject) {
      _format((EObject)dbaseModel, document);
      return;
    } else if (dbaseModel == null) {
      _format((Void)null, document);
      return;
    } else if (dbaseModel != null) {
      _format(dbaseModel, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dbaseModel, document).toString());
    }
  }
}
