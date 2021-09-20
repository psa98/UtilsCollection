package c.ponom.utilscollection.UtilsCollection_blankj;

import androidx.annotation.Nullable;

import java.lang.reflect.Array;

public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * Return the array is empty.
     *
     * @param array The array.
     * @return {@code true}: yes<br>{@code false}: no
     */
    public static boolean isEmpty(@Nullable Object array) {
        return getLength(array) == 0;
    }

    /**
     * Return the size of array.
     *
     * @param array The array.
     * @return the size of array
     */
    public static int getLength(@Nullable Object array) {
        if (array == null) return 0;
        return Array.getLength(array);
    }

    public static boolean isSameLength(@Nullable Object array1, @Nullable Object array2) {
        return getLength(array1) == getLength(array2);
    }


    ///////////////////////////////////////////////////////////////////////////
    // subArray
    ///////////////////////////////////////////////////////////////////////////

    @Nullable
    public static <T> T[] subArray(@Nullable T[] array, int startIndexInclusive, int endIndexExclusive) {
        //noinspection unchecked
        return (T[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static long[] subArray(@Nullable long[] array, int startIndexInclusive, int endIndexExclusive) {
        return (long[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static int[] subArray(@Nullable int[] array, int startIndexInclusive, int endIndexExclusive) {
        return (int[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static short[] subArray(@Nullable short[] array, int startIndexInclusive, int endIndexExclusive) {
        return (short[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static char[] subArray(@Nullable char[] array, int startIndexInclusive, int endIndexExclusive) {
        return (char[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static byte[] subArray(@Nullable byte[] array, int startIndexInclusive, int endIndexExclusive) {
        return (byte[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static double[] subArray(@Nullable double[] array, int startIndexInclusive, int endIndexExclusive) {
        return (double[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static float[] subArray(@Nullable float[] array, int startIndexInclusive, int endIndexExclusive) {
        return (float[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    public static boolean[] subArray(@Nullable boolean[] array, int startIndexInclusive, int endIndexExclusive) {
        return (boolean[]) realSubArray(array, startIndexInclusive, endIndexExclusive);
    }

    @Nullable
    private static Object realSubArray(@Nullable Object array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        int length = getLength(array);
        if (endIndexExclusive > length) {
            endIndexExclusive = length;
        }
        int newSize = endIndexExclusive - startIndexInclusive;
        Class type = array.getClass().getComponentType();
        if (newSize <= 0) {
            return Array.newInstance(type, 0);
        }
        Object subArray = Array.newInstance(type, newSize);
        System.arraycopy(array, startIndexInclusive, subArray, 0, newSize);
        return subArray;
    }


    ///////////////////////////////////////////////////////////////////////////
    // reverse
    ///////////////////////////////////////////////////////////////////////////

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>There is no special handling for multi-dimensional arrays.</p>
     *
     * <p>This method does nothing for a <code>null</code> input array.</p>
     *
     * @param array the array to reverse, may be <code>null</code>
     */
    public static <T> void reverse(T[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        T tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(long[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        long tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(short[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        short tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(char[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        char tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(byte[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        byte tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(double[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        double tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(float[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        float tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public static void reverse(boolean[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        boolean tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }


    public static int indexOf(@Nullable Object[] array, @Nullable final Object objectToFind, int startIndex) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (objectToFind == null) {
            for (int i = startIndex; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = startIndex; i < array.length; i++) {
                if (objectToFind.equals(array[i])) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }

    public static boolean contains(@Nullable Object[] array, @Nullable Object objectToFind) {
        return indexOf(array, objectToFind,0) != INDEX_NOT_FOUND;
    }



}
