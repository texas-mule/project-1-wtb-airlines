package com.revature.project1mule;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.revature.project1mule.flightschool.responsePojos.Route;

public class RouteDao {

	private static RouteDao uniqueInstance;
	private Connection conn;

	public static RouteDao getDao() {
		if (uniqueInstance == null)
			uniqueInstance = new RouteDao();
		return uniqueInstance;
	}

	private RouteDao() {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("src/main/resources/config.properties"));
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(props.getProperty("elephant.url"),
					props.getProperty("elephant.username"), props.getProperty("elephant.password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insert(int rr, Object ai, Object aul, Object ar, Integer pi, Object as, int pa, String pn, Object an,
			Object apc, int rp, String rn) {
		String sql = "INSERT INTO route (requested_range, aircraft_id, aircraft_useful_load, "
				+ "aircraft_range, pilot_id, aircraft_speed, pilot_age, pilot_name, "
				+ "aircraft_name, aircraft_passenger_capacity, requested_passengers, name) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, rr);
			pstmt.setInt(2, (Integer) ai);
			pstmt.setInt(3, (Integer) aul);
			pstmt.setInt(4, (Integer) ar);
			pstmt.setInt(5, (Integer) pi);
			pstmt.setInt(6, (Integer) as);
			pstmt.setInt(7, (Integer) pa);
			pstmt.setString(8, pn);
			pstmt.setString(9, (String) an);
			pstmt.setInt(10, (Integer) apc);
			pstmt.setInt(11, (Integer) rp);
			pstmt.setString(12, rn);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public String update(int rr, Object ai, Object aul, Object ar, Integer pi, Object as, int pa, String pn, Object an,
			Object apc, int rp, int r_id) {
		String sql = "UPDATE route SET requested_range = ?, aircraft_id = ?, aircraft_useful_load = ?, "
				+ "aircraft_range = ?, pilot_id = ?, aircraft_speed = ?, pilot_age = ?, pilot_name = ?, "
				+ "aircraft_name = ?, aircraft_passenger_capacity = ?, requested_passengers = ? " + "WHERE id = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, rr);
			pstmt.setInt(2, (Integer) ai);
			pstmt.setInt(3, (Integer) aul);
			pstmt.setInt(4, (Integer) ar);
			pstmt.setInt(5, (Integer) pi);
			pstmt.setInt(6, (Integer) as);
			pstmt.setInt(7, (Integer) pa);
			pstmt.setString(8, pn);
			pstmt.setString(9, (String) an);
			pstmt.setInt(10, (Integer) apc);
			pstmt.setInt(11, (Integer) rp);
			pstmt.setInt(12, r_id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Route " + r_id + " Updated";
	}

	public boolean pilotAssigned(int pi) {
		String sql = "SELECT pilot_id FROM route WHERE pilot_id = ?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, pi);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Route getRouteByName(String route_name) {
		try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM route WHERE name = ?;")) {
			ps.setString(1, route_name);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Route(rs.getInt("requested_range"), rs.getInt("aircraft_id"),
							rs.getInt("aircraft_useful_load"), rs.getInt("aircraft_range"), rs.getInt("pilot_id"),
							rs.getInt("aircraft_speed"), rs.getInt("pilot_age"), rs.getString("pilot_name"),
							rs.getString("aircraft_name"), rs.getInt("aircraft_passenger_capacity"),
							rs.getInt("requested_passengers"), rs.getString("name"), rs.getInt("id"),
							rs.getDate("created_date"), rs.getDate("modified_date"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Route getRouteById(int route_id) {
		try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM route WHERE id = ?;")) {
			ps.setInt(1, route_id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Route(rs.getInt("requested_range"), rs.getInt("aircraft_id"),
							rs.getInt("aircraft_useful_load"), rs.getInt("aircraft_range"), rs.getInt("pilot_id"),
							rs.getInt("aircraft_speed"), rs.getInt("pilot_age"), rs.getString("pilot_name"),
							rs.getString("aircraft_name"), rs.getInt("aircraft_passenger_capacity"),
							rs.getInt("requested_passengers"), rs.getString("name"), rs.getInt("id"),
							rs.getDate("created_date"), rs.getDate("modified_date"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
