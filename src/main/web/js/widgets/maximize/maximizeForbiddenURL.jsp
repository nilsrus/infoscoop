<%--
# infoScoop Calendar
# Copyright (C) 2010 Beacon IT Inc.
# 
# This program is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License
# as published by the Free Software Foundation; either version 2
# of the License, or (at your option) any later version.
# 
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
# 
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see
# <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>.
--%>

<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<title></title>
</head>

<body>

<% 
String url = request.getParameter("url");
%> 
%{ms_forbiddenurlPage}<br>
<a href="<%= url %>" target="_blank">%{lb_openNewWindow}</a>
</body>
</html>
