/*
 Violet - A program for editing UML diagrams.

 Copyright (C) 2007 Cay S. Horstmann (http://horstmann.com)
 Alexandre de Pellegrin (http://alexdp.free.fr);

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.horstmann.violet.product.diagram.usecase.edge;

import com.horstmann.violet.product.diagram.abstracts.edge.bentstyle.BentStyle;
import com.horstmann.violet.product.diagram.common.edge.LabeledLineEdge;
import com.horstmann.violet.product.diagram.usecase.UseCaseDiagramConstant;

/**
 * An edge that is shaped like a line with up to three segments with an arrowhead
 */
public class InteractionEdge extends LabeledLineEdge
{
    public InteractionEdge()
    {
        super();
        setBentStyle(BentStyle.STRAIGHT);
    }

    protected InteractionEdge(LabeledLineEdge clone)
    {
        super(clone);
    }

    @Override
    public InteractionEdge copy()
    {
        return new InteractionEdge(this);
    }


    @Override
    public String getToolTip()
    {
        return UseCaseDiagramConstant.USE_CASE_DIAGRAM_RESOURCE.getString("tooltip.interaction");
    }
}
