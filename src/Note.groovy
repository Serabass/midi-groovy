class Note {
    enum NoteName {
        C, D, E, F, G, A, B
    }

    int octave = 1;
    NoteName name = 'C';
    boolean diez = false;

    Note(String note) {

    }

    Note(NoteName name, boolean diez, int octave) {
        this.name = name;
        this.diez = diez;
        this.octave = octave;
    }

    Note(int number) {

    }

    String toString() {
        "${name}${diez ? '#' : ''}${octave}"
    }
}
