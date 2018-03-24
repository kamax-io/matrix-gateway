/*
 * Matrix Gateway Daemon
 * Copyright (C) 2018 Kamax Sarl
 *
 * https://www.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.matrix.gw.model;

import io.kamax.matrix.gw.model.acl.AclTargetHandler;
import io.kamax.matrix.gw.model.acl.GroupTargetHandler;
import io.kamax.matrix.gw.model.acl.MethodTargetHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AclTargetHandlerMapper {

    private Map<String, AclTargetHandler> handlers;

    public AclTargetHandlerMapper() {
        handlers = new HashMap<>();
        handlers.put("method", new MethodTargetHandler());
        handlers.put("group", new GroupTargetHandler());
    }

    public Optional<AclTargetHandler> map(String id) {
        return Optional.ofNullable(handlers.get(id));
    }

}