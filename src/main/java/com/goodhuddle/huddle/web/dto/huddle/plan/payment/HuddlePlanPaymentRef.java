/*
 * (C) Copyright ${year} Nuxeo SA (http://nuxeo.com/) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.goodhuddle.huddle.web.dto.huddle.plan.payment;

import java.math.BigDecimal;

public class HuddlePlanPaymentRef {

    private long id;
    private int amountInCents;

    public HuddlePlanPaymentRef(long id, int amountInCents) {
        this.id = id;
        this.amountInCents = amountInCents;
    }

    public long getId() {
        return id;
    }

    public int getAmountInCents() {
        return amountInCents;
    }


    public BigDecimal getAmount() {
        return new BigDecimal(amountInCents).divide(new BigDecimal(100));
    }
}
