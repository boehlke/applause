/*
 * generated by Xtext
 */
package org.applause.lang.ui;

import org.applause.lang.ui.quickfix.ApplauseDslQuickfixProvider;
import org.applause.lang.ui.wizard.CustomApplauseProjectCreator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ApplauseDslUiModule extends org.applause.lang.ui.AbstractApplauseDslUiModule {
	public ApplauseDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IssueResolutionProvider> bindIssueResolutionProvider() {
		return ApplauseDslQuickfixProvider.class;
	}	

	@Override
	public Class<? extends IProjectCreator> bindIProjectCreator() {
		return CustomApplauseProjectCreator.class;
	}
	
}
