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

package com.goodhuddle.huddle.web.dto.theme;

import java.util.List;

public class ThemeSettingsSectionDetail {

    private String code;
    private String name;
    private List<ThemeSettingsFieldDetail> fields;

    public ThemeSettingsSectionDetail(String code, String name, List<ThemeSettingsFieldDetail> fields) {
        this.code = code;
        this.name = name;
        this.fields = fields;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<ThemeSettingsFieldDetail> getFields() {
        return fields;
    }
}
