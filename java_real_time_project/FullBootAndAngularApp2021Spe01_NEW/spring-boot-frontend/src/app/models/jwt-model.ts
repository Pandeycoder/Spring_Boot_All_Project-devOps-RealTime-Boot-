export class JwtModel {
  constructor(
    public token: string,
    public type: string,
    public id: number,
    public username: string,
    public email: string,
    public roles: string[]
  ) {}
}
