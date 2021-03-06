/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service.http;

import com.liferay.calendar.service.CalendarBookingServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.liferay.calendar.service.CalendarBookingServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.calendar.model.CalendarBookingSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.calendar.model.CalendarBooking}, that is translated to a
 * {@link com.liferay.calendar.model.CalendarBookingSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    Eduardo Lundgren
 * @see       CalendarBookingServiceHttp
 * @see       com.liferay.calendar.model.CalendarBookingSoap
 * @see       com.liferay.calendar.service.CalendarBookingServiceUtil
 * @generated
 */
public class CalendarBookingServiceSoap {
	public static com.liferay.calendar.model.CalendarBookingSoap addCalendarBooking(
		long calendarId, long[] childCalendarIds, long parentCalendarBookingId,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String location,
		long startTime, long endTime, boolean allDay,
		java.lang.String recurrence, long firstReminder,
		java.lang.String firstReminderType, long secondReminder,
		java.lang.String secondReminderType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.addCalendarBooking(calendarId,
					childCalendarIds, parentCalendarBookingId, titleMap,
					descriptionMap, location, startTime, endTime, allDay,
					recurrence, firstReminder, firstReminderType,
					secondReminder, secondReminderType, serviceContext);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap deleteCalendarBooking(
		long calendarBookingId) throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.deleteCalendarBooking(calendarBookingId);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCalendarBookingInstance(long calendarBookingId,
		long startTime, boolean allFollowing) throws RemoteException {
		try {
			CalendarBookingServiceUtil.deleteCalendarBookingInstance(calendarBookingId,
				startTime, allFollowing);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap fetchCalendarBooking(
		long calendarBookingId) throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.fetchCalendarBooking(calendarBookingId);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap getCalendarBooking(
		long calendarBookingId) throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.getCalendarBooking(calendarBookingId);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap getCalendarBooking(
		long calendarId, long parentCalendarBookingId)
		throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.getCalendarBooking(calendarId,
					parentCalendarBookingId);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap[] getCalendarBookings(
		long calendarId, long startTime, long endTime)
		throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarBooking> returnValue =
				CalendarBookingServiceUtil.getCalendarBookings(calendarId,
					startTime, endTime);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap[] getCalendarBookings(
		long calendarId, long startTime, long endTime, int max)
		throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarBooking> returnValue =
				CalendarBookingServiceUtil.getCalendarBookings(calendarId,
					startTime, endTime, max);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap[] getChildCalendarBookings(
		long parentCalendarBookingId) throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarBooking> returnValue =
				CalendarBookingServiceUtil.getChildCalendarBookings(parentCalendarBookingId);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap[] getChildCalendarBookings(
		long parentCalendarBookingId, int status) throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarBooking> returnValue =
				CalendarBookingServiceUtil.getChildCalendarBookings(parentCalendarBookingId,
					status);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void invokeTransition(long calendarBookingId,
		java.lang.String transitionName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			CalendarBookingServiceUtil.invokeTransition(calendarBookingId,
				transitionName, serviceContext);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap[] search(
		long companyId, long[] groupIds, long[] calendarIds,
		long[] calendarResourceIds, long parentCalendarBookingId,
		java.lang.String keywords, long startTime, long endTime,
		boolean recurring, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarBooking> returnValue =
				CalendarBookingServiceUtil.search(companyId, groupIds,
					calendarIds, calendarResourceIds, parentCalendarBookingId,
					keywords, startTime, endTime, recurring, statuses, start,
					end, orderByComparator);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap[] search(
		long companyId, long[] groupIds, long[] calendarIds,
		long[] calendarResourceIds, long parentCalendarBookingId,
		java.lang.String title, java.lang.String description,
		java.lang.String location, long startTime, long endTime,
		boolean recurring, int[] statuses, boolean andOperator, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarBooking> returnValue =
				CalendarBookingServiceUtil.search(companyId, groupIds,
					calendarIds, calendarResourceIds, parentCalendarBookingId,
					title, description, location, startTime, endTime,
					recurring, statuses, andOperator, start, end,
					orderByComparator);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int searchCount(long companyId, long[] groupIds,
		long[] calendarIds, long[] calendarResourceIds,
		long parentCalendarBookingId, java.lang.String keywords,
		long startTime, long endTime, boolean recurring, int[] statuses)
		throws RemoteException {
		try {
			int returnValue = CalendarBookingServiceUtil.searchCount(companyId,
					groupIds, calendarIds, calendarResourceIds,
					parentCalendarBookingId, keywords, startTime, endTime,
					recurring, statuses);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int searchCount(long companyId, long[] groupIds,
		long[] calendarIds, long[] calendarResourceIds,
		long parentCalendarBookingId, java.lang.String title,
		java.lang.String description, java.lang.String location,
		long startTime, long endTime, boolean recurring, int[] statuses,
		boolean andOperator) throws RemoteException {
		try {
			int returnValue = CalendarBookingServiceUtil.searchCount(companyId,
					groupIds, calendarIds, calendarResourceIds,
					parentCalendarBookingId, title, description, location,
					startTime, endTime, recurring, statuses, andOperator);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap updateCalendarBooking(
		long calendarBookingId, long calendarId, long[] childCalendarIds,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String location,
		long startTime, long endTime, boolean allDay,
		java.lang.String recurrence, long firstReminder,
		java.lang.String firstReminderType, long secondReminder,
		java.lang.String secondReminderType, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.updateCalendarBooking(calendarBookingId,
					calendarId, childCalendarIds, titleMap, descriptionMap,
					location, startTime, endTime, allDay, recurrence,
					firstReminder, firstReminderType, secondReminder,
					secondReminderType, status, serviceContext);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap updateCalendarBooking(
		long calendarBookingId, long calendarId,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String location,
		long startTime, long endTime, boolean allDay,
		java.lang.String recurrence, long firstReminder,
		java.lang.String firstReminderType, long secondReminder,
		java.lang.String secondReminderType, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.updateCalendarBooking(calendarBookingId,
					calendarId, titleMap, descriptionMap, location, startTime,
					endTime, allDay, recurrence, firstReminder,
					firstReminderType, secondReminder, secondReminderType,
					status, serviceContext);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap updateCalendarBookingInstance(
		long calendarBookingId, long calendarId, long[] childCalendarIds,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String location,
		long startTime, long endTime, boolean allDay,
		java.lang.String recurrence, boolean allFollowing, long firstReminder,
		java.lang.String firstReminderType, long secondReminder,
		java.lang.String secondReminderType, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.updateCalendarBookingInstance(calendarBookingId,
					calendarId, childCalendarIds, titleMap, descriptionMap,
					location, startTime, endTime, allDay, recurrence,
					allFollowing, firstReminder, firstReminderType,
					secondReminder, secondReminderType, status, serviceContext);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarBookingSoap updateCalendarBookingInstance(
		long calendarBookingId, long calendarId,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String location,
		long startTime, long endTime, boolean allDay,
		java.lang.String recurrence, boolean allFollowing, long firstReminder,
		java.lang.String firstReminderType, long secondReminder,
		java.lang.String secondReminderType, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarBooking returnValue = CalendarBookingServiceUtil.updateCalendarBookingInstance(calendarBookingId,
					calendarId, titleMap, descriptionMap, location, startTime,
					endTime, allDay, recurrence, allFollowing, firstReminder,
					firstReminderType, secondReminder, secondReminderType,
					status, serviceContext);

			return com.liferay.calendar.model.CalendarBookingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CalendarBookingServiceSoap.class);
}