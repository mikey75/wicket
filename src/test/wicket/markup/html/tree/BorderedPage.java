/*
 * $Id$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wicket.markup.html.tree;

import wicket.Component;
import wicket.MarkupContainer;
import wicket.markup.html.WebPage;
import wicket.markup.html.border.Border;

/**
 * Base page with norder.
 */
public abstract class BorderedPage extends WebPage
{
	/** Border. */
	private Border border;

	/**
	 * Constructor.
	 */
	public BorderedPage()
	{
		border = new PageBorder("border");
		super.add(border);
	}

	/**
	 * @see wicket.MarkupContainer#add(wicket.Component)
	 */
	public MarkupContainer add(final Component child)
	{
		// Add children of the page to the page's border component
		border.add(child);
		return this;
	}

	/**
	 * @see wicket.MarkupContainer#removeAll()
	 */
	public void removeAll()
	{
		border.removeAll();
	}

	/**
	 * @see wicket.MarkupContainer#replace(wicket.Component)
	 */
	public MarkupContainer replace(Component child)
	{
		return border.replace(child);
	}
	
	/**
	 * @see wicket.MarkupContainer#autoAdd(Component)
	 */
	public boolean autoAdd(final Component component)
	{
	    return border.autoAdd(component);
	}
}
