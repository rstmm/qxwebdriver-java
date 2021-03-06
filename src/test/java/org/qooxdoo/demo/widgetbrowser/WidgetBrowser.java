package org.qooxdoo.demo.widgetbrowser;

import org.oneandone.qxwebdriver.By;
import org.oneandone.qxwebdriver.ui.Selectable;
import org.oneandone.qxwebdriver.ui.Widget;
import org.qooxdoo.demo.IntegrationTest;

public abstract class WidgetBrowser extends IntegrationTest {

	static Widget tabPage;

	/**
	 * Clicks a button in the Widget Browser's main tab bar
	 */
	public static void selectTab(String title) {
		String locator = "qx.ui.container.Composite/qx.ui.container.Scroll/qx.ui.tabview.TabView";
		Selectable tabView = (Selectable) driver.findWidget(By.qxh(locator));
		tabView.selectItem(title);
		
		String tabPageLocator = "qx.ui.tabview.Page";
		tabPage = tabView.findWidget(By.qxh(tabPageLocator));
	}
}
