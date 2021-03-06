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

package com.goodhuddle.huddle.web.dto.mailout;

import com.goodhuddle.huddle.domain.Email;
import com.goodhuddle.huddle.web.dto.member.MemberRef;
import org.joda.time.DateTime;

public class EmailRow extends EmailRef {

    private DateTime sentOn;
    private String subject;

    public EmailRow(long id, MemberRef recipient, Email.Status status, DateTime sentOn, String subject) {
        super(id, recipient, status);
        this.sentOn = sentOn;
        this.subject = subject;
    }

    public DateTime getSentOn() {
        return sentOn;
    }

    public String getSubject() {
        return subject;
    }
}
