export class Proveedor {
    identificacion!: string;
    primerNombre: string;
    primerApellido: string;
    direccion: string;

    constructor(primerNombre: string, primerApellido: string, direccion: string){
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.direccion = direccion;
    }
}
