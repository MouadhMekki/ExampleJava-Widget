/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.microej.demo.widgets.page;

import ej.composite.GridComposite;
import ej.composite.SplitComposite;
import ej.mwt.Widget;
import ej.widget.basic.CircularProgressBar;
import ej.widget.basic.ProgressBar;
import ej.widget.basic.picto.PictoProgressBar;

/**
 * This page illustrates the different implementations of a progress bar.
 */
public class ProgressBarPage extends WidgetsPage {

	private static final int MIN = 0;
	private static final int MAX = 100;
	private static final int INITIAL = 0;

	@Override
	protected String getTitle() {
		return "Progress bar"; //$NON-NLS-1$
	}

	@Override
	protected boolean canGoBack() {
		return true;
	}

	@Override
	protected Widget createMainContent() {
		// layout:
		// | progress bar |
		// | circular progress bar - picto progress bar |

		GridComposite grid = new GridComposite();
		grid.setHorizontal(true);
		grid.setCount(1);

		ProgressBar progressBar = new ProgressBar(MIN, MAX, INITIAL);
		progressBar.setIndeterminate(true);
		grid.add(progressBar);

		SplitComposite splitComposite = new SplitComposite();
		splitComposite.setHorizontal(true);
		splitComposite.setRatio(0.5f);
		grid.add(splitComposite);

		CircularProgressBar circularProgressBar = new CircularProgressBar(MIN, MAX, INITIAL);
		circularProgressBar.setIndeterminate(true);
		splitComposite.add(circularProgressBar);

		PictoProgressBar pictoProgressBar = new PictoProgressBar(MIN, MAX, INITIAL);
		pictoProgressBar.setIndeterminate(true);
		splitComposite.add(pictoProgressBar);

		return grid;
	}

}