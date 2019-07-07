package de.rockyj.exercism.isbnverifier

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {

    @Test fun `test isbn 1`() {
        assertTrue(isISBN("3-598-21508-8"))
    }

    @Test fun `test isbn 2`() {
        assertFalse(isISBN("3-598-21508-9"))
    }

    @Test fun `test isbn 3`() {
        assertTrue(isISBN("3-598-21507-X"))
    }

    @Test fun `test isbn 4`() {
        assertFalse(isISBN("3-598-21507-A"))
    }

    @Test fun `test isbn 5`() {
        assertFalse(isISBN("3-598-2K507-0"))
    }

    @Test fun `test isbn 6`() {
        assertFalse(isISBN("3-598-2X507-9"))
    }

    @Test fun `test isbn 7`() {
        assertTrue(isISBN("3598215088"))
    }

    @Test fun `test isbn 8`() {
        assertTrue(isISBN("359821507X"))
    }

    @Test fun `test isbn 9`() {
        assertFalse(isISBN("359821507"))
    }

    @Test fun `test isbn 10`() {
        assertFalse(isISBN("00"))
    }

    @Test fun `test isbn 11`() {
        assertFalse(isISBN("3-598-21507"))
    }

    @Test fun `test isbn 12`() {
        assertFalse(isISBN("3-598-21507-XX"))
    }

    @Test fun `test isbn 13`() {
        assertFalse(isISBN("3-598-21515-X"))
    }
}