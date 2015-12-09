
class Chord {
    ArrayList<Note> notes = [];

    Chord(String notes) {
        this.notes = notes
                .split(',')
                .collect({ new Note(it) })
        ;
    }

    Chord(ArrayList<Note> notes) {
        this.notes = notes;
    }

    String toString() {
        notes
                .collect({ it.toString() })
                .join(',')
        ;
    }
}
