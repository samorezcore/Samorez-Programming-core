package org.firstinspires.ftc.teamcode.config;

import com.acmerobotics.dashboard.config.Config;

/**
 * Centralized configuration for all robot hardware and behavior constants.
 * Edit values here and they'll update in real-time via FTC Dashboard.
 */
@Config
public class RobotConfig {
    
    // ========== DRIVETRAIN ==========
    public static final double HEADING_KP = 0.01;
    public static final double HEADING_KD = 0.002;
    public static final double HEADING_DEADBAND = 1.2;
    public static final double MAX_TURN_POWER = 0.5;
    
    // ========== SHOOTER ==========
    public static double SHOOTER_KP = 1.2;
    public static double SHOOTER_KI = 0.0005;
    public static double SHOOTER_KD = 0.00008;
    public static double SHOOTER_MAX_POWER = 1.0;
    public static double SHOOTER_RPM_TOLERANCE = 120;
    public static double SHOOTER_INTEGRAL_LIMIT = 2000;
    
    public static double PRESET_1_RPM = 4500;
    public static double PRESET_2_RPM = 2200;
    public static double PRESET_1_HOOD = 0.2;
    public static double PRESET_2_HOOD = 0.12;
    
    // ========== SPINDEX (SPIN INDEXER) ==========
    public static double[] SPINDEX_POSITIONS = {0.01, 0.34, 0.67, 0.84, 0.51, 0.18};
    public static int[] INTAKE_SLOT_INDICES = {0, 1, 2};
    public static int[] OUTTAKE_SLOT_INDICES = {3, 4, 5};
    public static long SPINDEX_SLOT_MOVE_DELAY = 340;
    
    // ========== SERVOS ==========
    public static double TRANSFER_SERVO_OUT = 0.4;
    public static double TRANSFER_SERVO_IN = 0.0;
    public static long TRANSFER_SERVO_OUT_TIME = 160;
    public static long WAIT_BETWEEN_SHOTS = 200;
    
    // ========== INTAKE ==========
    public static double INTAKE_POWER = 0.85;
    public static double INTAKE_TRIGGER_THRESHOLD = 0.2;
    
    // ========== COLOR SENSOR (HSV Thresholds) ==========
    public static float GREEN_HUE_MIN = 150f;
    public static float GREEN_HUE_MAX = 165f;
    public static float GREEN_SAT_MIN = 0.6f;
    public static float GREEN_VAL_MIN = 0.2f;
    
    public static float PURPLE_HUE_MIN = 215f;
    public static float PURPLE_HUE_MAX = 230f;
    public static float PURPLE_SAT_MIN = 0.4f;
    public static float PURPLE_VAL_MIN = 0.2f;
}