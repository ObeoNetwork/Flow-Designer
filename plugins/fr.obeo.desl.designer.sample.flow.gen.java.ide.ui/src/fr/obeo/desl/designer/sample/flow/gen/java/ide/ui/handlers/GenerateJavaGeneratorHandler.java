//Start of user code copyright
//End of user code

package fr.obeo.desl.designer.sample.flow.gen.java.ide.ui.handlers;

//Start of user code imports

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import fr.obeo.dsl.designer.sample.flow.CompositeProcessor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import fr.obeo.desl.designer.sample.flow.gen.java.ide.ui.Activator;
import fr.obeo.desl.designer.sample.flow.gen.java.ide.ui.GenerateJavaGeneratorEclipse;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

//End of user code

/**
 * Command handler for
 * fr::obeo::desl::designer::sample::flow::gen::java::main::generateJava.
 * 
 * @author Laurent Redor
 * @generated
 */
public class GenerateJavaGeneratorHandler extends AbstractHandler {

	/**
	 * @generated
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);

		final IRunnableWithProgress generateRunnable = new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				final Iterator<?> it = selection.iterator();
				final List<Object> selectedList = new ArrayList<>();
				while (it.hasNext()) {
					selectedList.add(it.next());
				}
				final SubMonitor subMonitor = SubMonitor.convert(monitor, selectedList.size());
				for (Object selected : selectedList) {
					final Monitor childMonitor = BasicMonitor.toMonitor(subMonitor.split(1));
					final GenerateJavaGeneratorEclipse generator;
					try {
						if (selected instanceof CompositeProcessor) {
							generator = new GenerateJavaGeneratorEclipse((CompositeProcessor) selected);
							generator.generate(childMonitor);
						} else if (selected instanceof IFile) {
							generator = new GenerateJavaGeneratorEclipse((IFile) selected);
							generator.generate(childMonitor);
						}
					} finally {
						childMonitor.done();
					}
					if (monitor.isCanceled()) {
						break;
					}
				}
			}
		};

		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, generateRunnable);
		} catch (InvocationTargetException e) {
			Activator.getDefault()
					.log(new Status(IStatus.ERROR, getClass(), "Couldn't generate.", e.getTargetException()));
		} catch (InterruptedException e) {
			Activator.getDefault().log(new Status(IStatus.ERROR, getClass(), "Couldn't generate.", e));
		}

		return null;
	}

}
