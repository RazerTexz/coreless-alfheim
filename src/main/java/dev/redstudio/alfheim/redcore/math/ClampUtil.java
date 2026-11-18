package dev.redstudio.redcore.math;

@SuppressWarnings("ManualMinMaxCalculation")
public final class ClampUtil {
    private ClampUtil() {}
    public static final int clampMinFirst(final int input, final int min, final int max) {
        return input < min ? min : input > max ? max : input;
    }
}